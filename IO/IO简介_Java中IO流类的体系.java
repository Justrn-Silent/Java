package IO;
/*
Java 中流的概念细分
按流的方向分类:
输入流:数据流从数据源到程序(以 Inputstream、Reader 结尾的流)-->读
输出流:数据流从程序到目的地(以 OutPutstream、writer 结尾的流) -->写

------------------------------------------------------------------------------
1.InputStream/OutputStream
字节流的抽象类。
2. Reader/Writer
字符流的抽象类。
3. FilelnputStream/FileOutputStream
节点流:以字节为单位直接操作“文件”。
4.ByteArrayInputStream/ByteArrayOutputStream
节点流:以字节为单位直接操作“字节数组对象”
5.ObjectInputStream/ObjectOutputStream
处理流:以字节为单位直接操作“对象”。
6. DatalnputStream/DataOutputStream
处理流:以字节为单位直接操作“基本数据类型与字符串类型”，
7. FileReader/FileWriter
节点流:以字符为单位直接操作“文本文件”(注意:只能读写文本文件)
8. BufferedReader/BufferedWriter
处理流:将 Reader/writer 对象进行包装，增加缓存功能，提高读写效率。
9. BufferedinputStream/BufferedOutputStream
处理流:将 InputStream/0utputstream 对象进行包装，增加缓存功能，提高读写效率。
10.InputStreamReader/OutputStreamWriter
处理流:将字节流对象转化成字符流对象。
11. PrintStream
处理流:将 Outputstream 进行包装，可以方便地输出字符，更加灵活，
 */
public class IO简介_Java中IO流类的体系 {

}
