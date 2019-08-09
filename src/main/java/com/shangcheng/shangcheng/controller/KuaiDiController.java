package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.KuaiDi;
import com.shangcheng.shangcheng.service.KuaiDiService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/9
 */
@Controller
public class KuaiDiController {
    @Autowired
    private KuaiDiService kuaiDiService;
/*
* 查询快递公司及其公司代号
* */
    @RequestMapping("getAllKuaiDi")
    @ResponseBody
    public List<KuaiDi> getAllKuaiDi(){
        return kuaiDiService.getAllKuaiDi();
    }
    @RequestMapping("ex")
    @ResponseBody
    public void ex() throws Exception {
        Workbook wb = new XSSFWorkbook(new File("e:/etoak.xlsx"));
        //2.获得Sheet
        Sheet sheet = wb.getSheetAt(0);
        //3.获得行范围
        int fR = sheet.getFirstRowNum();
        int lR = sheet.getLastRowNum();
        System.out.println(fR +"\t"+lR);
        for(int i=fR;i<=lR;i++){
            //4.获得某一行
            Row row = sheet.getRow(i);
            //5.获得列范围
            int fc = row.getFirstCellNum();
            int lc = row.getLastCellNum();
            for(int k=fc;k<lc;k++){
                //6.获得某一列
                Cell cell = row.getCell(k);
                if(cell.getCellType()==0){
                    System.out.print(cell.getNumericCellValue()+"\t");
                }else{
                    System.out.print(cell.getStringCellValue()+"\t");
                }
            }
            System.out.println();
        }
    }
}
