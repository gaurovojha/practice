package com.sapient.feecalculator.reader;

import java.io.File;

import com.sapient.feecalculator.Constant.FILETYPE;
import practice.core.java.puzzles.sapient.feecalculator.reader.ExcelTransctionReader;

public class TrasactionReader {
	/**
	 * 
	 *//*
	private static TrasactionReader trasactionReader;
	*//**
	 * 
	 *//*
	private static ExcelTransctionReader excelTransctionReader;
	*//**
	 * 
	 *//*
	private static com.sapient.feecalculator.reader.XMLTransctionReader xmlTransctionReader;
	*//**
	 * 
	 *//*
	private static com.sapient.feecalculator.reader.TextTransctionReader textTransctionReader;

	*//**
	 * 
	 * @return
	 *//*
	public static TrasactionReader getTrasactionReaderInstance() {
		if (null == trasactionReader) {
			synchronized (TrasactionReader.class){
				if (null == trasactionReader) {
					trasactionReader = new TrasactionReader();
					excelTransctionReader= new ExcelTransctionReader();
					xmlTransctionReader = new com.sapient.feecalculator.reader.XMLTransctionReader();
					textTransctionReader = new com.sapient.feecalculator.reader.TextTransctionReader();
				}
			}
		}
		return trasactionReader;
	}

	*//**
	 * 
	 * @return
	 *//*
	public ExcelTransctionReader readExcelFile(){
		return excelTransctionReader;
	}

	*//**
	 * 
	 * @return
	 *//*
	public com.sapient.feecalculator.reader.XMLTransctionReader readXmlFile(){
		return xmlTransctionReader;
	}

	*//**
	 * 
	 * @return
	 *//*
	public com.sapient.feecalculator.reader.TextTransctionReader readTextFile(){
		return textTransctionReader;
	}

	*//**
	 * 
	 * @param fileType
	 * @return
	 *//*
	public com.sapient.feecalculator.reader.ITransactionManager readFile(FILETYPE fileType, File transactionFile) {
		switch (fileType) {
		case CSV:
			excelTransctionReader.readTransaction(transactionFile);
			return excelTransctionReader;
		case TEXT:
			textTransctionReader.readTransaction(transactionFile);
			return textTransctionReader;
		case XML:
			xmlTransctionReader.readTransaction(transactionFile);
			return xmlTransctionReader;

		default:
			return null;
		}
	}
*/


}
