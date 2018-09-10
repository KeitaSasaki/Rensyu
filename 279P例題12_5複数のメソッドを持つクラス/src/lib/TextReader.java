package lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
	private Logger log = Logger.getLogger(TextReader.class.getName());
	private int index;

	private List<String> file;	// バッファ

	private static Charset defaultDecode = Charset.forName("UTF-8");

	public TextReader(String fname) {
		this(Paths.get(fname));
	}

	public TextReader(String fname, String decode) {
		this(Paths.get(fname), decode);
	}

	public TextReader(Path path) {
		this(path, null);
	}

	public TextReader(Path path, String decode) {
		index = 0;
		file = getText(path, decode);
	}

	public static Charset getDefaultDecode() {
		return defaultDecode;
	}

	public static void setDefaultDecode(String decode) {
		defaultDecode = Charset.forName(decode);
	}

	/**
	 * 1行分読み出す。改行コードはつかない。
	 *
	 * @return
	 */
	public String readLine() {
		if(file == null) {
			return null;
		} else if(file.size() == 0) {
			return null;
		} else if(index >= file.size()) {
			return null;
		}
		return file.get(index++);
	}

	/**
	 * CSVデータをStringの配列として読みだす
	 *
	 * @return
	 */
	public String[] readCsv() {
		String line = readLine();
		if(line == null) {
			return null;
		} else {
			return line.split(",");
		}
	}

	/**
	 * ファイルの内容をリストに入れて返す
	 *
	 * @return
	 */
	public List<String> readAllLines() {
		return file;
	}

	/**
	 * 読み出し位置を先頭に戻す
	 */
	public void rewind() {
		index = 0;
	}

	/**
	 * バッファにあるデータの件数（行数）を返す
	 *
	 * @return
	 */
	public int size() {
		return file.size();
	}

	/**
	 * ファイルの行を昇順に並べ替える
	 */
	public void sort() {
		Collections.sort(file);
	}

	/**
	 * ファイルを閉じてバッファを開放する
	 */
	public void close() {
		file = null;
	}

	/**
	 * ファイルをデコードして読み出す
	 *
	 * @param path
	 * @param encode
	 * @return
	 */
	private List<String> getText(Path path, String encode) {
		List<String> lines = null;
		try {
			if(encode == null) {
				lines = Files.readAllLines(path, defaultDecode);
			} else {
				lines = Files.readAllLines(path, Charset.forName(encode));
			}
		} catch (IOException e) {
			log.severe(e.toString());
		}
		return lines;

	}

}
