package com.doomlastudio.nekahapp.userdata;

import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userstatus.StatusModel;

import java.util.ArrayList;

public class DataUser {

    private  static String[] userName = {
            "Annisa",
            "Aliko",
            "Benamer",
            "Erika",
            "Hegazy",
            "Ifrah",
            "Katsiaryna",
            "Rachid",
            "Umi",
            "Zibik"
    };

    private static String[] userAge = {
            "25",
            "20",
            "30",
            "20",
            "22",
            "24",
            "33",
            "32",
            "21",
            "19"

    };
    private static String[] userPlace = {
            "USA",
            "Australia",
            "Canada",
            "Turkey",
            "India",
            "Turkey",
            "Dubai",
            "Arab",
            "Australia",
            "England"

    };

    private static String[] userDesc = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna."

    };
    private static String[] userHobbies = {
            "Reed book",
            "Ballroom dancing",
            "Photography",
            "Traveling",
            "Painting",
            "Horse riding",
            "Watching movies",
            "Cooking",
            "Singing",
            "Swimming"

    };
    private static String[] userProfession = {
            "Student",
            "Accounting",
            "Photografer",
            "Traveler",
            "Artist",
            "Accounting",
            "Teacher",
            "Chef",
            "Singer",
            "Atlete"

    };

    private  static int[] userPhotoProfile = {
            R.drawable.annisa_photo,
            R.drawable.aliko_photo,
            R.drawable.benamer_photo,
            R.drawable.erika_photo,
            R.drawable.hegazy_photo,
            R.drawable.ifrah_photo,
            R.drawable.katsiaryna_photo,
            R.drawable.rachid_photo,
            R.drawable.umi_photo,
            R.drawable.zibik_photo
    };
    public static ArrayList<DataModel> getListData(){
        ArrayList<DataModel>list = new ArrayList<>();
        for (int position = 0; position < userName.length; position++){
            DataModel model = new DataModel();
            model.setNama(userName[position]);
            model.setUmur(userAge[position]);
            model.setTempat(userPlace[position]);
            model.setHobi(userHobbies[position]);
            model.setPekerjaan(userProfession[position]);
            model.setDeskripsi(userDesc[position]);
            model.setPhotoprofile(userPhotoProfile[position]);
            list.add(model);
        }
        return list;
    }
}
