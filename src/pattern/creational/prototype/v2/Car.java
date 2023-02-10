package pattern.creational.prototype.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car implements Cloneable{
    private String name;
    // 초기 로딩되는 공통 기본 펌웨어 정보
    final List<String> bfirmware;

    // 개별 객체에서 관리되는 영역.
    List<String> firmware;

    public Car() {
        bfirmware = new ArrayList<>();
        loadFirmware();
    }

    public void loadFirmware() {
        // 초기 객체 생성시 필요한 로딩 작업 수행.
        System.out.println("## 펌웨어 로딩중.......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bfirmware.add("펌웨어 v1.0");
        bfirmware.add("네비게이션 3D 모드");
        bfirmware.add("자동 차선 변경 모드");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return this;
        //copyOf, unmodifiableList 등도 사용 가능하지만 read-only 객체가 리턴됨.
        firmware = bfirmware.stream().collect(Collectors.toList());
        //firmware = new ArrayList<>(bfirmware);

        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}