package Service;

import Models.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    public static ArrayList<Staff> staffList = new ArrayList<>();
    public StaffService() {
        staffList.add(new Staff(1, "Son", 20, "https://scontent.fhan3-5.fna.fbcdn.net/v/t1.6435-9/133745320_1371764969869986_5438829881273074037_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=MQpPqnfzKRYAX8vu3Xw&tn=YpOGrVoll7lgLUYW&_nc_ht=scontent.fhan3-5.fna&oh=00_AT8vC0NlWfgmKQLymmGqovCXGgYI9YWrZnquiDxYBJ4hJw&oe=61F07921"));
        staffList.add(new Staff(2, "Bin Chuot", 25, "https://scontent.fsgn3-1.fna.fbcdn.net/v/t39.30808-6/251536367_942705276322286_9088079058322174528_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=8bfeb9&_nc_ohc=Logb_Ob7SmQAX8dNh1F&tn=YpOGrVoll7lgLUYW&_nc_ht=scontent.fsgn3-1.fna&oh=00_AT8gxvSMDjMb38-9Lq8yC6utxih8B0qcbZrAqK9i_mkbtw&oe=61D02289"));
        staffList.add(new Staff(3, "Trung ech", 25, "https://scontent.fsgn3-1.fna.fbcdn.net/v/t39.30808-6/241191264_2091888610965307_5159568541428612490_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=Fm0Jc2Wtsl4AX8cBjOL&_nc_ht=scontent.fsgn3-1.fna&oh=00_AT_4HIW_nBZfB3yar3J3uwTzjqlOD2MscZU1Fj--weKtMA&oe=61CF149E"));
        staffList.add(new Staff(4, "Vinhz", 30, "https://scontent.fsgn13-2.fna.fbcdn.net/v/t39.30808-6/262972260_277402574364129_1743104023563141691_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=8OlBiHH1j3AAX9O-OtV&_nc_ht=scontent.fsgn13-2.fna&oh=00_AT-gaCmgFv76AF5aliQ3s9NJWoeD2rSrEwmUf19xX61URg&oe=61D0872D"));
    }

    public List<Staff> findall(){
        return staffList;
    }
    public void save(Staff staff){
        staffList.add(staff);
    }

    public int findById(int id) {
        for (int i = 0; i < staffList.size(); i++) {
            if (id == staffList.get(i).getId()){
                return i;
            }
        }
        return -1;
    }

    public void update(int id, Staff staff){
        staffList.set(id, staff);
    }

    public void delete(int id){
        staffList.remove(id);
    }

}
