package lib;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Is {
	/**
	 * csが大文字を含むかどうか調べる
	 *
	 * @param cs
	 * @return
	 */
	public static boolean withUpperCase(CharSequence cs) {
		String str = cs.toString();
		return str.matches(".*[A-Z].*");
	}

	/**
	 * csが小文字を含むかどうか調べる
	 *
	 * @param cs
	 * @return
	 */
	public static boolean withLowerCase(CharSequence cs) {
		String str = cs.toString();
		return str.matches(".*[a-z].*");
	}

	/**
	 * csが数字を含むかどうか調べる
	 *
	 * @param cs
	 * @return
	 */
	public static boolean withDigit(CharSequence cs) {
		String str = cs.toString();
		return str.matches(".*[0-9].*");
	}

	/**
	 * filepathが存在することをチェックする
	 * 
	 * @param filepath
	 * @return 存在する時trueを返す
	 */
	public static boolean exist(String filepath) {
		return Files.exists(Paths.get(filepath));
	}

	/**
	 * filepathが存在しないことをチェックする
	 * 
	 * @param filepath
	 * @return 存在しない時trueを返す
	 */
	public static boolean notExist(String filepath) {
		return Files.notExists(Paths.get(filepath));
	}

}
