package main.java.async.interfaces;

import main.java.utils.interfaces.IContext;

public interface IThreadExecutor<T extends Thread> {
    public void execute(IContext context) throws Exception;

    public void addConsumer(T consumer, IContext context);

}
