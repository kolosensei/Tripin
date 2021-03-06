package com.android.tripin.entity;

import com.android.tripin.enums.Transportation;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Felix on 6/15/2018.
 * Description: Route路线表的实例
 */
public class Route implements Serializable {

    private static final long serialVersionUID = 1L;

    private int routeID;

    private int planID;

    private int origin;

    private int destination;

    private Transportation routeTransportation;

    private int routeTime;

    private int distance;

    private boolean routeIsChosen;

    public Route() {
    }

    public Route(int routeID, int planID, int origin, int destination, Transportation routeTransportation, int routeTime, int distance, boolean routeIsChosen) {
        this.routeID = routeID;
        this.planID = planID;
        this.origin = origin;
        this.destination = destination;
        this.routeTransportation = routeTransportation;
        this.routeTime = routeTime;
        this.distance = distance;
        this.routeIsChosen = routeIsChosen;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public Transportation getRouteTransportation() {
        return routeTransportation;
    }

    public void setRouteTransportation(Transportation routeTransportation) {
        this.routeTransportation = routeTransportation;
    }

    public int getRouteTime() {
        return routeTime;
    }

    public void setRouteTime(int routeTime) {
        this.routeTime = routeTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isRouteIsChosen() {
        return routeIsChosen;
    }

    public void setRouteIsChosen(boolean routeIsChosen) {
        this.routeIsChosen = routeIsChosen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return getRouteID() == route.getRouteID() &&
                getPlanID() == route.getPlanID() &&
                getOrigin() == route.getOrigin() &&
                getDestination() == route.getDestination() &&
                getRouteTime() == route.getRouteTime() &&
                getDistance() == route.getDistance() &&
                isRouteIsChosen() == route.isRouteIsChosen() &&
                getRouteTransportation() == route.getRouteTransportation();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRouteID(), getPlanID(), getOrigin(), getDestination(), getRouteTransportation(), getRouteTime(), getDistance(), isRouteIsChosen());
    }
}
