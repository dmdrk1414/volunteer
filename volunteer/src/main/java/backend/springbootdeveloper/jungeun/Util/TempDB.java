package backend.springbootdeveloper.jungeun.Util;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.domain.VolunteerList;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TempDB {
    static final String VOLUNTEER_PATH = "classpath:config/json/volunteerTable.json";

    public List<VolunteerList> getVolunteer(){
        List<VolunteerList> Data = new ArrayList<>();

        try {
            JSONParser parser = new JSONParser();
            File file = ResourceUtils.getFile(VOLUNTEER_PATH);
            // JSON 파일 읽기
            Reader reader = new FileReader(file);
            JSONArray dataArray = (JSONArray) parser.parse(reader);

            for (Object obj : dataArray) {
                JSONObject element = (JSONObject) obj;
                Long id = (Long) element.get("id");
                String title = (String) element.get("title");
                String region = (String) element.get("region");
                String adOffice = (String) element.get("adOffice");
                String adPeriod = (String) element.get("adPeriod");
                String volunteerPeriod = (String) element.get("volunteerPeriod");
                String remainPeriod = (String) element.get("remainPeriod");


                VolunteerList volunteerlist = VolunteerList.builder()
                        .id(id)
                        .title(title)
                        .region(region)
                        .adOffice(adOffice)
                        .adPeriod(adPeriod)
                        .volunteerPeriod(volunteerPeriod)
                        .remainPeriod(remainPeriod)
                        .build();

                Data.add(volunteerlist);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return Data;
    }

}
