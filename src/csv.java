package Final_ticket;

public void csv() {
        File csv = new File("C:\\Users\\sohyeon\\Desktop\\report_SHWORLD.csv");
        BufferedWriter bw = null; // ��� ��Ʈ�� ����
        
        try {
            bw = new BufferedWriter(new FileWriter(csv, true));
            // csv������ ���� ���� �̾���� ��ó�� true�� �����ϰ�, ���� ���� ������� true�� �����Ѵ�
            for (int i = 0; i < dataList.size(); i++) {
                String[] data = dataList.get(i);
                String aData = "";
                aData = data[0] + "," + data[1] + "," + data[2] + "," + data[3]+"\n";
        
                // �� �ٿ� ���� �� ������ ���̿� ,�� �ִ´�
                bw.write(aData);
                // �ۼ��� �����͸� ���Ͽ� �ִ´�
             
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
                    bw.flush(); // �����ִ� �����ͱ��� ���� �ش�
                   ; // ����� BufferedWriter�� �ݾ� �ش�
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }