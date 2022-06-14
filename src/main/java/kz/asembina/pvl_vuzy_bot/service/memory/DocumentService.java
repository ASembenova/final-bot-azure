package kz.asembina.pvl_vuzy_bot.service.memory;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    public int counter;

    public int getCounter() {
        counter++;
        return counter;
    }
}
