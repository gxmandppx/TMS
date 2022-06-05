package top.imengying.tms.Entity;

public class Project {
    private Integer pid;
    private Integer tid;
    private String pName;
    private Integer pExpense;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpExpense() {
        return pExpense;
    }

    public void setpExpense(Integer pExpense) {
        this.pExpense = pExpense;
    }
}
