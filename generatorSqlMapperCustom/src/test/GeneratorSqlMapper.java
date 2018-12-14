package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlMapper {
	
	public void generator() throws Exception{
		  List<String> warnings = new ArrayList<String>();
	      boolean overwrite =true;
	      File configFile = new File("src/generatorConfig.xml");
	      ConfigurationParser cp = new ConfigurationParser(warnings);
	      Configuration config = cp.parseConfiguration(configFile);
	      DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	      MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
	      myBatisGenerator.generate(null);
	}  
	
	public static void main(String[] args) {
		GeneratorSqlMapper generatorSqlMapper = new GeneratorSqlMapper();
		try {
			generatorSqlMapper.generator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
