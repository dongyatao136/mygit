package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Category;
 //aaab
public interface CategoryMapper {
 
    public int add(Category category);  
       
      
    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
    
      
    public int count();  
    
//    杀杀杀
    
}
