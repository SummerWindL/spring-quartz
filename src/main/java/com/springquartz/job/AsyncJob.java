package com.springquartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author fuyl
 * @createTime 20181017 23:33
 * @description
 */
public class AsyncJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("========================立即执行的任务，只执行一次===============================");
        System.out.println("jobName=====:"+jobExecutionContext.getJobDetail().getKey().getName());
        System.out.println("jobGroup=====:"+jobExecutionContext.getJobDetail().getKey().getGroup());
        System.out.println("taskData=====:"+jobExecutionContext.getJobDetail().getJobDataMap().get("asyncData"));
    }
}
