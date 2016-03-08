package org.hisp.dhis.android.dashboard.ui.events;

/**
 * Created by arazabishov on 7/27/15.
 */
public final class DataEvent {
    private DataEventType mDataEventType;
    private String mPassDashboardName;

    public DataEvent(String name, DataEventType type) {
        mPassDashboardName = name;
        mDataEventType = type;
    }

    public enum DataEventType {
        ADDED, DELETED
    }

    public DataEventType getmDataEventType() {
        return mDataEventType;
    }

    public String getmPassDashboardName() {
        return mPassDashboardName;
    }
}
