package org.example.repository;

import org.example.DetailUtil;
import org.example.model.Detail;

import java.util.List;
import java.util.stream.Collectors;

public class DetailRepository {

    public Detail save(Detail detail) {
        if (detail.isNew()) {
            detail.setId(DetailUtil.counter.incrementAndGet());
        }
        return DetailUtil.repository.put(detail.getId(), detail);
    }

    public void delete(int id) {
        DetailUtil.repository.remove(id);
    }

    public Detail get(int id) {
        return DetailUtil.repository.get(id);
    }

    public List<Detail> getAllMeals() {
        return DetailUtil.repository.values().stream().collect(Collectors.toList());
    }

}
