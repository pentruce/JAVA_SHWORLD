package Final_ticket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DATAREPORT_SHWORLD {
	ArrayList<OrderData_SHWORLD> Oradea = new ArrayList<OrderData_SHWORLD>(); //csv ���� ����Ʈ
	
	public void writeCsv(ArrayList<String> list) {
		String fileName = "C:\\ticketing\\test1.csv";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			for (String analysisList : list) {
				out.write(analysisList.getBytes());
			}
			System.out.println("\n�� ������ C����̺� ticketing ������ ����Ǿ����ϴ�.\n");
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
		private static String get(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		private static int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		 
	}