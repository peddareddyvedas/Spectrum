package com.example.dell.spectrum.TapbarFragments;

/**
 * Created by WAVE on 7/31/2017.
 */

public class RelationModel {
    String name;
    String relation;
    int img;
public  RelationModel(){

}
    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg() {
        return img;
    }
}
