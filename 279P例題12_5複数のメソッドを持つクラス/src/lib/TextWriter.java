package lib;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * テキストをファイルに書き出す。
 *
 */
public class TextWriter implements Closeable {
	private Logger log = Logger.getLogger(TextWriter.class.getName());

	private Path path;
	private List<String> file;
	private StandardOpenOption[] mode;
	private Charset encode;
	private static Charset defaultEncode = Charset.forName("UTF-8");

	public TextWriter(String path) {
		this(Paths.get(path), 'c', null);
	}

	public TextWriter(String path, char mode) {
		this(Paths.get(path), mode, null);	// nullはデフォルトのエンコード
	}

	public TextWriter(String path, String encode) {
		this(Paths.get(path), 'c', encode);
	}

	public TextWriter(String path, char mode, String encode) {
		this(Paths.get(path), mode, encode);
	}

	public TextWriter(String path, String encode, char mode) {
		this(Paths.get(path), encode, mode);
	}

	public TextWriter(Path path) {
		this(path, 'c', null);
	}

	public TextWriter(Path path, char mode) {
		this(path, mode, null);	// nullはデフォルトのエンコード
	}

	public TextWriter(Path path, String encode) {
		this(path, 'c', encode);
	}

	public TextWriter(Path path, String encode, char mode) {
		this(path, mode, encode);
	}

	public TextWriter(Path path, char mode, String encode) {
		this.path = path;
		if(mode == 'a' || mode == 'A') {
			this.mode = new StandardOpenOption[] { StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.APPEND };
		} else {
			this.mode = new StandardOpenOption[] { StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING };
		}
		this.encode = (encode == null ? null : Charset.forName(encode));

	}

	//////////////////////////////////////////////////////////////

	public static Charset getDefaultEncode() {
		return defaultEncode;
	}

	public static void setDefaultEncode(String encode) {
		defaultEncode = Charset.forName(encode);
	}

	/**
	 * 改行コードを付けてテキストをファイルに書く
	 *
	 * @param text
	 */
	public void println(Object text) {
		if(file == null) {
			file = new ArrayList<String>();
		}
		if(text == null) {
			return;
		}
		file.add(text.toString() + System.lineSeparator());	// 改行コードを付ける
	}

	/**
	 * 改行コートを付けずにテキストをファイルに書く
	 *
	 * @param text
	 */
	public void print(Object text) {
		if(file == null) {
			file = new ArrayList<String>();
		}
		if(text == null) {
			return;
		}
		file.add(text.toString());	// 改行コードを付けない
	}

	public void print(byte text) {
		print(String.valueOf(text));
	}

	public void print(short text) {
		print(String.valueOf(text));
	}

	public void print(int text) {
		print(String.valueOf(text));
	}

	public void print(long text) {
		print(String.valueOf(text));
	}

	public void print(float text) {
		print(String.valueOf(text));
	}

	public void print(double text) {
		print(String.valueOf(text));
	}

	public void print(char text) {
		print(String.valueOf(text));
	}

	public void print(boolean text) {
		print(String.valueOf(text));
	}

	/**
	 * 改行コードを付けて出力する
	 *
	 * @param text
	 */
	public void println(byte text) {
		println(String.valueOf(text));
	}

	public void println(short text) {
		println(String.valueOf(text));
	}

	public void println(int text) {
		println(String.valueOf(text));
	}

	public void println(long text) {
		println(String.valueOf(text));
	}

	public void println(float text) {
		println(String.valueOf(text));
	}

	public void println(double text) {
		println(String.valueOf(text));
	}

	public void println(char text) {
		println(String.valueOf(text));
	}

	public void println(boolean text) {
		println(String.valueOf(text));
	}

	/**
	 * 書式付き出力
	 *
	 * @param text
	 * @param args
	 */
	public void printf(String text, Object... args) {
		StringWriter sw = new StringWriter();
		PrintWriter out = new PrintWriter(sw);
		out.printf(text, args);
		file.add(sw.toString());

	}

	/**
	 * バッファをファイルに出力する
	 */
	public void flash() {
		putText();
	}

	/**
	 * バッファをファイルに出力し、ファイルを閉じる
	 */
	@Override
	public void close() {
		putText();
		file = null;
	}

	private void putText() {
		if(encode == null) {
			encode = defaultEncode;
		}
		try(BufferedWriter out = Files.newBufferedWriter(path, encode, mode);) {
			for(String s : file) {
				out.write(s);
			}
		} catch (IOException e) {
			log.severe(e.toString());
		}
	}
}
