package com.cesde.gestor.main;

import com.cesde.gestor.model.Record;

public class ProgramMain {
    public static void main(String[] args) {
        Record record = new Record();
        record.dataRecord();

        System.out.println(record.toString());
    }
}
