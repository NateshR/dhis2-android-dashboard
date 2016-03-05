package org.hisp.dhis.android.dashboard.ui.events;

/**
 * Created by nateshrelhan on 05/03/16.
 */
public class DataEvent {
    public String mPassDashboardName;
    public DataEventType mDataEventType;
    public DataEvent(String passDashboardName, DataEventType dataEventType) {
        this.mPassDashboardName = passDashboardName;
        this.mDataEventType = dataEventType;
    }

    public enum DataEventType {
        ADDED, DELETED
    }
}
