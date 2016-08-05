package com.data.kafka;

/**
 * Created by Administrator on 2016/6/25.
 */

import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

import java.util.Random;

public class PartitionerDemo implements Partitioner {
    public PartitionerDemo(VerifiableProperties props) {

    }

    public int partition(Object obj, int numPartitions) {
//        int partition = 0;
//        if (obj instanceof String) {
//            String key=(String)obj;
//            int offset = key.lastIndexOf('.');
//            if (offset > 0) {
//                partition = Integer.parseInt(key.substring(offset + 1)) % numPartitions;
//            }
//        }else{
//            partition = obj.toString().length() % numPartitions;
//        }
//
//        return partition;
        Random r = new Random();
        return r.nextInt(4);
    }

}
