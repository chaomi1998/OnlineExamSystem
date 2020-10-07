package cn.edu.buu.uoes.dao;

import cn.edu.buu.uoes.pojo.Note;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface NoteDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Oct 05 16:05:59 CST 2020
     */
    @Delete({
        "delete from note",
        "where nno = #{nno,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer nno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Oct 05 16:05:59 CST 2020
     */
    @Insert({
        "insert into note (nno, note_text, ",
        "nsend_user, nget_user, ",
        "time)",
        "values (#{nno,jdbcType=INTEGER}, #{noteText,jdbcType=VARCHAR}, ",
        "#{nsendUser,jdbcType=INTEGER}, #{ngetUser,jdbcType=INTEGER}, ",
        "#{time,jdbcType=TIMESTAMP})"
    })
    int insert(Note record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Oct 05 16:05:59 CST 2020
     */
    @Select({
        "select",
        "nno, note_text, nsend_user, nget_user, time",
        "from note",
        "where nno = #{nno,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="nno", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="note_text", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nsend_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="nget_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    Note selectByPrimaryKey(Integer nno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Oct 05 16:05:59 CST 2020
     */
    @Select({
        "select",
        "nno, note_text, nsend_user, nget_user, time",
        "from note"
    })
    @ConstructorArgs({
        @Arg(column="nno", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="note_text", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nsend_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="nget_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<Note> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbg.generated Mon Oct 05 16:05:59 CST 2020
     */
    @Update({
        "update note",
        "set note_text = #{noteText,jdbcType=VARCHAR},",
          "nsend_user = #{nsendUser,jdbcType=INTEGER},",
          "nget_user = #{ngetUser,jdbcType=INTEGER},",
          "time = #{time,jdbcType=TIMESTAMP}",
        "where nno = #{nno,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Note record);

    @Select({
            "select",
            "nno, note_text, nsend_user, nget_user, time",
            "from note",
            "where nsend_user = #{uno}"
    })
    @ConstructorArgs({
            @Arg(column="nno", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="note_text", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="nsend_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="nget_user", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<Note> selectBySendId(int uno);
}