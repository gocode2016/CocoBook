package com.copasso.cocobook.model.type;

/**
 * Created by zhouas666 on 18-1-23.
 *
 */

public enum BookDistillate implements BookConvert{
    ALL("全部","","normal"),
    BOUTIQUES("精品","true","distillate");

    String typeName;
    String netName;
    String dbName;
    BookDistillate(String typeName, String netName, String dbName){
        this.typeName = typeName;
        this.netName = netName;
        this.dbName = dbName;
    }

    @Override
    public String getTypeName(){
        return typeName;
    }

    @Override
    public String getNetName(){
        return netName;
    }

    public String getDbName(){
        return dbName;
    }
}
