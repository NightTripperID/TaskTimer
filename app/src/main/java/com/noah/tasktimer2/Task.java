package com.noah.tasktimer2;

import java.io.Serializable;

/**
 * Created by jeep on 8/9/17.
 */

class Task implements Serializable {
    public static final long serialVersionUID = 20170809L;

    private long m_Id;
    private final String mName;
    private final String mDescription;
    private final int mSortOrder;

    public Task(long id, String mName, String mDescription, int mSortOrder) {
        this.m_Id = id;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mSortOrder = mSortOrder;
    }

    public long getId() {
        return m_Id;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getSortOrder() {
        return mSortOrder;
    }

    public void setId(long id) {
        this.m_Id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "m_Id=" + m_Id +
                ", mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mSortOrder=" + mSortOrder +
                '}';
    }
}
