package com.kitanasoftware.interactiveguide.map;

import com.kitanasoftware.interactiveguide.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Chudo on 27.01.2016.
 */
public class GeopointsData {
    private ArrayList<Geopoint> geopoints;
    private Map<String,Integer> typesOfGeopoints;
    private ArrayList<Integer> colors;
    private static GeopointsData geopointsInstance = new GeopointsData();

    public static GeopointsData getInstance() {
        return geopointsInstance;
    }

    public ArrayList<Geopoint> getGeopoints() {
        return geopoints;
    }

    public void setGeopoints(ArrayList<Geopoint> geopoints) {
        this.geopoints = geopoints;
    }

    public Map<String, Integer> getTypesOfGeopoints() {
        return typesOfGeopoints;
    }

    public void setTypesOfGeopoints(Map<String, Integer> typesOfGeopoints) {
        this.typesOfGeopoints = typesOfGeopoints;
    }

    public ArrayList<Integer> getColors() {
        return colors;
    }

    private GeopointsData() {

        geopoints = new ArrayList<Geopoint>();
        geopoints.add(new Geopoint("name1", "Guide", R.drawable.test_icon1, new double[]{31.915091, 34.768182}));
        geopoints.add(new Geopoint("name2", "Bathroom", R.drawable.test_icon2, new double[]{31.768182, 34.765182}));
        geopoints.add(new Geopoint("name3", "Cool place", R.drawable.test_icon3, new double[]{31.763182, 34.765181}));
        geopoints.add(new Geopoint("name4", "Cool place", R.drawable.test_icon4, new double[]{31.468182, 34.565182}));
        geopoints.add(new Geopoint("name5", "Meeting point", R.drawable.test_icon5, new double[]{31.768162, 34.735182}));
        geopoints.add(new Geopoint("name6", "Eating point", R.drawable.test_icon6, new double[]{32.768182, 34.715182}));
        geopoints.add(new Geopoint("name7", "Eating point", R.drawable.test_icon7, new double[]{31.768482, 34.715183}));
        geopoints.add(new Geopoint("name8t", "Eating point", R.drawable.test_icon8, new double[]{31.915091, 34.766781}));

        typesOfGeopoints = new HashMap<String,Integer>();
        typesOfGeopoints.put("guide", R.drawable.test_icon1);
        typesOfGeopoints.put("bathroom", R.drawable.test_icon2);
        typesOfGeopoints.put("cool place",R.drawable.test_icon3);
        typesOfGeopoints.put("eating point", R.drawable.test_icon6);
        typesOfGeopoints.put("meeting point", R.drawable.test_icon5);

        colors = new ArrayList<Integer>();
        colors.add(R.drawable.test_icon1);
        colors.add(R.drawable.test_icon2);
        colors.add(R.drawable.test_icon3);
        colors.add(R.drawable.test_icon4);
        colors.add(R.drawable.test_icon5);
        colors.add(R.drawable.test_icon6);
        colors.add(R.drawable.test_icon7);
        colors.add(R.drawable.test_icon8);


    }
}
