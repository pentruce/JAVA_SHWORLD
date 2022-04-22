package Final_ticket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DATAREPORT_SHWORLD {
	ArrayList<OrderData_SHWORLD> Oradea = new ArrayList<OrderData_SHWORLD>(); //csv 파일 리스트
	
	public void writeCsv(ArrayList<String> list) {
		String fileName = "C:\\ticketing\\test1.csv";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			for (String analysisList : list) {
				out.write(analysisList.getBytes());
			}
			System.out.println("\n▶ 파일이 C드라이브 ticketing 폴더에 저장되었습니다.\n");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close();
			} catch (IOException e) {
			}
		}
	}
	public static void writeToFile() throws IOException {
	OrderData_SHWORLD Oradea;
	
	TicketSystem_SHWORLD ticketSystem_SHWORLD; 

		FileWriter fw = new FileWriter("C:\\Users\\sohyeon\\Desktop\\report.csv");
		String title = "DATE,  T-type,  Age,  Time,  Quan,  Price,  S.Offer";

		fw.write(title);
		fw.write(ticketSystem_SHWORLD.OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getLine());
		fw.close();
	}
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
		private static String get(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		private static int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		 
	}