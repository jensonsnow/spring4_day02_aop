package com.itheima.spring.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {
	
	/*
	 * ǰ��֪ͨ
	 * */
	public void checkPri(JoinPoint joinPoint) {
		System.out.println("Ȩ��У��==================="+joinPoint);
	}

	/**
	 * ����֪ͨ
	 * @param  
	 */
	public void writeLog(Object result) {
		System.out.println("��־��¼==================="+result);
	}
	
	
	/**
	 * ����֪ͨ   �������ܵļ��
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("����ǰ֪ͨ===================");
		
		Object obj = joinPoint.proceed();
		
		System.out.println("���ƺ�֪ͨ===================");
		return obj;
	}
	
	/**
	 * �쳣�׳�֪ͨ
	 */
	public void afterThrowing(Throwable ex) {
		System.out.println("�쳣�׳�֪ͨ==================="+ex.getMessage());
	}
	
	/**
	 * ����֪ͨ �൱��finally������е�����
	 */
	
	public void after() {
		System.out.println("����֪ͨ===================");
	}
 }
