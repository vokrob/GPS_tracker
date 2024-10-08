package com.vokrob.gps_tracker;

import android.health.connect.datatypes.ExerciseRoute;
import android.location.Location;

public interface LocListenerInterface {
    public void OnLocationChanged (Location loc);
}
