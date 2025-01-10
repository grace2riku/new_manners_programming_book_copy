# new_manners_programming_book_copy
書籍【プログラミング〈新〉作法 　～これからプログラムを書く人のために】の写経

# 動作確認環境

## C
[chap2](chap2)、[chap3](chap3)にCのコードが格納されている。
ローカルPCにCの開発環境を構築し、確認している。

### サンプルプログラム確認方法
*.cのディレクトリに移動しコンパイルする。

```
$ gcc code2-1.c
```

a.outを実行する（以下はcode2-1.cの実行結果）

```
$ ./a.out 
How many do you need?: 2
Total : 300 yen
```


### 開発環境のバージョン
```
$ gcc --version
Apple clang version 15.0.0 (clang-1500.1.0.2.5)
Target: x86_64-apple-darwin22.6.0
Thread model: posix
InstalledDir: /Library/Developer/CommandLineTools/usr/bin
```

## Java
[chap4](chap4)にJavaのコードが格納されている。
ローカルPCにJavaの開発環境を構築し、確認している。

### サンプルプログラム確認方法
Main.javaがあるディレクトリに移動する。

コンパイルする。
```
$ javac Main.java 
```

実行する。
```
$ java Main
```

### 開発環境のバージョン
```
$ java -version
java version "17.0.8" 2023-07-18 LTS
Java(TM) SE Runtime Environment (build 17.0.8+9-LTS-211)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.8+9-LTS-211, mixed mode, sharing)
```

```
$ javac --version
javac 17.0.8
```
