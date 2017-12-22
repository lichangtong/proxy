package net.spring.context;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

public class TestResource implements InitializingBean{
    private Resource[] resource;

    public Resource[] getResource() {
        return resource;
    }

    public void setResource(Resource[] resource) {
        this.resource = resource;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if(resource!=null && resource.length>0){
            System.out.println(resource.length);

           InputStream rs =  resource[0].getInputStream();
            byte[] bytes = new byte[1024];
            int byteCount = 0;
            while ((byteCount = rs.read(bytes)) != -1)
            {
                System.out.println(new String(bytes));
//                outputStream.write(bytes, bytesWritten, byteCount);
//                bytesWritten += byteCount;
            }

        }
    }
}
