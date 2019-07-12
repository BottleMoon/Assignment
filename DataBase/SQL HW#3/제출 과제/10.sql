SELECT distinct s.name, empNo
FROM Studio s,Movie,MovieExec e
WHERE presNo=certNo and soundStudio=s.name;