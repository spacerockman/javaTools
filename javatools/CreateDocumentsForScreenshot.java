package javatools;

import java.io.File;

public class CreateDocumentsForScreenshot {
	public static void main(String[] args) {
		createDocuments();
	}

	public static void createDocuments() {
		// set the path of documents
		String filePath = "d:\\test";
		File myPath = new File(filePath);
		if (!myPath.exists()) {
			myPath.mkdir();
			System.out.println("the path of created file is " + filePath);
			// set the amount of items
			int amount = 10;
			// set the head number
			String headNum = "1";
			// set the middle number
			String middleNum = "01";

			for (int i = 0; i <= amount; i++) {
				String fileName = headNum + middleNum + "0";
				String filePath2 = "d:\\test" + "\\" + fileName + i;
				if (i < 10) {
					String fileNameDoubleZero = headNum + middleNum + "00";
					String filePath3 = "d:\\test" + "\\" + fileNameDoubleZero + i;
					File myPath3 = new File(filePath3);
					if (!myPath3.exists()) {
						myPath3.mkdir();
					}
				} else if (i < 100) {
					File myPath2 = new File(filePath2);
					if (!myPath2.exists()) {
						myPath2.mkdir();
					}
				} else {
					String fileNameNoneZero = "1-01-";
					String filePath4 = "d:\\test" + "\\" + fileNameNoneZero + i;
					File myPath4 = new File(filePath4);
					if (!myPath4.exists()) {
						myPath4.mkdir();
					}
				}

			}

		} else {
			File targetPath = new File(filePath);
			String[] currentFiles = targetPath.list();
			for (String s : currentFiles) {
				File fileList = new File(s);
				fileList.delete();
			}
		}
	}
}
