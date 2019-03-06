package com.fei.action;

import com.fei.domain.Document;
import com.fei.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class DocumentAction {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "getAllDocuments",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> getAllDocuments() throws Exception{
        List<Document> documents = documentService.getAllDocuments();
        System.out.println(documents);
        return documents;
    }

    //deleteDocumentAction?id=delete-1
    @RequestMapping("deleteDocumentAction")
    public void deleteDocumentAction(String id,HttpServletResponse response) throws Exception{
        int did = Integer.parseInt(id.split("-")[1]);
        documentService.removeDocumentsById(did);
        response.sendRedirect("/SSM_MOOC/getAllDocuments");
    }
}
