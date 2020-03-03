package dao.entity;

public class TestDTO {
    private Long id;

    private String testset;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestset() {
        return testset;
    }

    public void setTestset(String testset) {
        this.testset = testset == null ? null : testset.trim();
    }
}