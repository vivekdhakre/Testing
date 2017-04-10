package pattern.object.pool;

/**
 * Created by vivek on 16/2/17.
 */
public class ExportingProcess {

    private long processNo;

    public ExportingProcess(long processNo) {
        this.processNo = processNo;

        System.out.println("Object With Process no."+processNo+" was created");
    }

    public long getProcessNo() {
        return processNo;
    }
}
