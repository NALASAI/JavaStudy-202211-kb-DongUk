create view course_view
as
	select
		cm.id as course_id,
        cd.id as subject_id,
        cd.course_name as subject_name,
        cm.student_id,
        sm.`name` as stuent_name,
        status_id
	from
		course_mst cm
		left outer join course_dtl cd on(cd.id = cm.course_id)
		left outer join student_mst sm on(sm.id = cm.student_id);
 SELECT * FROM course_view;