package com.peaceful.cglib.demo.test;

import com.peaceful.common.util.Util;

/**
 * <a mailto:wangjuntytl@163.com>Email:wangjuntytl@163.com</a>
 *
 * @author wangjun
 * @version 1.0
 * @since 15/3/29.
 */

public class SampleClass {

    public SampleClass(){
        Util.report("SampleClass init ...");
    }
    public String test(String msg){
        return "SampleClass tell :"+msg;
    }

    public String say2(String msg){
        return "SampleClass tell :"+msg;
    }
}
