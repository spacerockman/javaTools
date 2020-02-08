package jtcoding1;

import java.io.File;

public class CreateDocumentsForScreenshot {
	public static void main(String[] args) {
		// 设置一级路径
		String filePath = "d:\\test";
		File myPath = new File(filePath);
		if (!myPath.exists()) {
			myPath.mkdir();
			System.out.println("the path of created file is " + filePath);
			// 循环填入路径
			for (int i = 0; i < 120; i++) {
				// 路径名称变换
				String fileName = "1-01-0";
				String filePath2 = "d:\\test" + "\\" + fileName + i;
				if (i < 10) {
					String fileNameDoubleZero = "1-01-00";
					String filePath3 = "d:\\test" + "\\" + fileNameDoubleZero + i;
					File myPath3 = new File(filePath3);
					if (!myPath3.exists()) {
						myPath3.mkdir();
					}
				}else if(i < 100){
					File myPath2 = new File(filePath2);
					if (!myPath2.exists()) {
						myPath2.mkdir();
					} 
				}else {
					String fileNameNoneZero = "1-01-";
					String filePath4 = "d:\\test" + "\\" + fileNameNoneZero + i;
					File myPath4 = new File(filePath4);
					if (!myPath4.exists()) {
						myPath4.mkdir();
					}
				}

			}

		}
	}
}
