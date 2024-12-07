package main.java.async;

import main.java.async.interfaces.IThreadExecutor;
import main.java.factory.CustomThreadFactory;
import main.java.utils.interfaces.IContext;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadExecutor implements IThreadExecutor {
    public static final Integer CORE_POOL_SIZE = 2;
    public static final Integer MAX_POOL_SIZE = 10;
    public static final Long KEEP_ALIVE_TIME = 1000L;
    public static final Long TIME_OUT = 4L;
    public static final TimeUnit TIME = TimeUnit.MILLISECONDS;
    private ExecutorService executorService;
    private List<Callable<Object>> tasks;

    public CustomThreadExecutor() {
        tasks = new ArrayList<>();
        executorService = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TIME, new PriorityBlockingQueue(), new CustomThreadFactory("MSExecutor"));
    }

    @Override
    public void execute(IContext context) throws Exception {
        executorService.invokeAll(tasks, TIME_OUT, TimeUnit.SECONDS);
    }

    @Override
    public void addConsumer(Thread task, IContext context) {
        tasks.add(Executors.callable(task));
    }
}
