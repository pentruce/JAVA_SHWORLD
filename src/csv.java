package Final_ticket;

public void csv() {
        File csv = new File("C:\\Users\\sohyeon\\Desktop\\report_SHWORLD.csv");
        BufferedWriter bw = null; // 출력 스트림 생성
        
        try {
            bw = new BufferedWriter(new FileWriter(csv, true));
            // csv파일의 기존 값에 이어쓰려면 위처럼 true를 지정하고, 기존 값을 덮어쓰려면 true를 삭제한다
            for (int i = 0; i < dataList.size(); i++) {
                String[] data = dataList.get(i);
                String aData = "";
                aData = data[0] + "," + data[1] + "," + data[2] + "," + data[3]+"\n";
        
                // 한 줄에 넣을 각 데이터 사이에 ,를 넣는다
                bw.write(aData);
                // 작성한 데이터를 파일에 넣는다
             
            } 
            
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
         
            try {
                if (bw != null) {
                	bw.close();
                    bw.flush(); // 남아있는 데이터까지 보내 준다
                   ; // 사용한 BufferedWriter를 닫아 준다
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }