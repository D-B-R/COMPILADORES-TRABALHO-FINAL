

Declaration of entrance and exitb: type IdentList;  // entrada e saida 
Type exit: writeln | write // tipo de saida
Type input: readln //tipo de saida

Declaration of Variables: Type IdentList ; // declaracao 
Type: int| float| boolean|  string | true | false  // tipo de saida 

Declaration of Variables: Type IdentList ;
Repeat Loops: Type IdentList ; // laços de repeticao 
Type: for| while // tipo de repeticao 

Declaration of Variables: Type IdentList ; // dclaracao
Flux control: Type Identilist;
Type: if | if else







IdentList: identifier , IdentList
identifier
Stmt : ForStmt
	| WhileStmt
	| Expr ;
	| IfStmt
	| CompoundStmt
	| Declaration
	| ;
ForStmt z for ( Expr ; OptExpr ; OptExpr ) Stmt


OptExpr : Expr
| ε
WhileStmt : while ( Expr ) Stmt
IfStmt : if ( Expr ) Stmt ElsePart
ElsePart : else Stmt
	| ε
CompoundStmt: { StmtList }
StmtList : StmtList Stmt
	| ε
Expr : identifier = Expr
	| Rvalue
Rvalue : Rvalue Compare Mag
	| Mag
Compare : == | < | > | <= | >= | !=
Mag : Mag + Term
	| Mag - Term
	| Term
Term : Term * Factor
	| Term / Factor
	| Factor
Factor : ( Expr )
	| - Factor
	| + Factor
	| identifier
	| number