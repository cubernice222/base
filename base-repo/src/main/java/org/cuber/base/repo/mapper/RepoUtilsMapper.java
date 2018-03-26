package org.cuber.base.repo.mapper;

import org.apache.ibatis.annotations.Param;

public interface RepoUtilsMapper {
    void truncateTable(@Param("tableName") String tableName);
}
