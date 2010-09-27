package org.testng.internal.thread.graph;

import java.util.List;

/**
 * A runnable object that is used by {@code GraphThreadPoolExecutor} to execute
 * tasks
 */
public interface IWorker<T> extends Runnable, Comparable<IWorker<T>> {

  /**
   * Gets the tasks that this worker is working on
   * @return list of tasks
   */
  List<T> getTasks();

  /**
   * Gets the maximum time allowed for the worker to complete the task
   * @return timeout
   */
  long getTimeOut();

  /**
   * Gets the priority of this task 
   * @return priority
   */
  int getPriority();
}