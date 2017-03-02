import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {

	public static void main(String[] args) {
	SparkConf conf=new SparkConf().setAppName("Line count").setMaster("local[2]").set("spark.executor.memory","1g");
	JavaSparkContext jsc=new JavaSparkContext(conf);
	JavaRDD<String> textRDD=jsc.textFile("/usr/local/Cellar/apache-spark/2.1.0/README.md");
	
	System.out.println(textRDD.count());
	}

}
