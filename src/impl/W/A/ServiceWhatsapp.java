package impl.W.A;

import enums.Status;
import impl.WhatsAppService;

public class ServiceWhatsapp implements WhatsAppService {
    @Override
    public void allStatus() {
        Status [] statuses = Status.values();
        for (Status sta:statuses) {
            System.out.println(sta);

        }
    }
}
