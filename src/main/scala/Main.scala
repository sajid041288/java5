package q
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
      // Create Spark session
      val spark = SparkSession.builder()
        .appName("SumExample")
        .master("local[*]")
        .getOrCreate()

      import spark.implicits._

      // Create a DataFrame with two numbers
      val data = Seq((5, 7),(4,10))
      val df = data.toDF("num1", "num2")

      // Add a new column with the sum of num1 and num2
      val dfWithSum = df.withColumn("sum", col("num1") + col("num2"))

      // Show the result
      dfWithSum.show()

    }



}