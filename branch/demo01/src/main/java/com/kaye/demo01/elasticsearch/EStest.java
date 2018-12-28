package com.kaye.demo01.elasticsearch;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;

public class EStest {


    public static void test1(int... arr){
        for (int a : arr
             ) {
            System.out.println(a);
        }
    }

    private static Settings settings = Settings.builder()
            .put("cluster.name","my-application").build();

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        test1(arr);
    }
}
