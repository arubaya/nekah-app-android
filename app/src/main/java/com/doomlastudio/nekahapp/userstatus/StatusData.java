package com.doomlastudio.nekahapp.userstatus;

import android.widget.TextView;

import com.doomlastudio.nekahapp.R;

import java.util.ArrayList;

public class StatusData {
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

    private static String[] userStatus = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nDui ut ornare lectus sit amet est. Sed pulvinar proin gravida hendrerit lectus. Et egestas quis ipsum suspendisse ultrices gravida dictum fusce. \nElit at imperdiet dui accumsan. Enim neque volutpat ac tincidunt vitae semper. Orci dapibus ultrices in iaculis nunc sed augue lacus. \nUltricies tristique nulla aliquet enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant. Ac ut consequat semper viverra nam libero justo laoreet sit. \nBibendum neque egestas congue quisque egestas diam. Est sit amet facilisis magna etiam. Suspendisse in est ante in nibh mauris cursus mattis molestie. \nNisi vitae suscipit tellus mauris a diam maecenas sed. Risus sed vulputate odio ut. Egestas congue quisque egestas diam in arcu. \nNunc sed blandit libero volutpat sed cras ornare."

    };

    private  static int[] userPhotoProfile = {
            R.drawable.photoofannisa,
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

    public static ArrayList<StatusModel> getListData(){
        ArrayList<StatusModel>list = new ArrayList<>();
        for (int position = 0; position < userName.length; position++){
            StatusModel model = new StatusModel();
            model.setNama(userName[position]);
            model.setStatus(userStatus[position]);
            model.setPhotoprofile(userPhotoProfile[position]);
            list.add(model);
        }
        return list;
    }
}
