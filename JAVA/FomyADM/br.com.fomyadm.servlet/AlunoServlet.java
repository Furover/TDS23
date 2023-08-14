

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlunoServlet
 */
@WebServlet("/AlunoServlet")
public class AlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String acao = request.getParameter("");
		String destino = "sucesso.jsp";
		String mensagem = "";
		List<Aluno> lista = new ArrayList<>();
		Aluno aluno = new Aluno();
		AlunoDao dao = new AlunoDao();
		
		try {
			if(!acao.equalsIgnoreCase("Listar")){
				aluno.setMatricula(Long.parseLong(request.getParameter("matricula")));
				aluno.setNome(request.getParameter("nome"));
				aluno.setTelefone(request.getParameter("telefone"));
				aluno.setEmail(request.getParameter("email"));
				
				try {
					DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
					aluno.setDataCadastro(df.parse(request.getParameter("dataCadastro")));
				} catch(Exception e) {
					aluno.setDataCadastro(new Date());
				}
			}
			if(acao.equalsIgnoreCase("Incluir")) {
				if(dao.existe(aluno)) {
					mensagem = "Matricula informada já existe!";
				}
				else {
					dao.inserir(aluno);
				}
			}
			else if(acao.equalsIgnoreCase("Alterar")) {
				dao.alterar(aluno);
			}
			else if(acao.equalsIgnoreCase("excluir")) {
				dao.excluir(aluno);
			}
			else if(acao.equalsIgnoreCase("consultar")) {
				request.setAttribute("aluno", aluno);
				aluno = dao.consultar(aluno);
				destino = "aluno.jsp";
			}
			
		} catch(Exception e) {
			mensagem += e.getMessage();
			destino = "erro.jsp";
			e.printStackTrace();
		}
		
		if(mensagem.length() == 0) {
			mensagem = "Aluno cadastrado com sucesso!";
		}
		else {
			destino = "erro.jsp";
		}
		
		lista = dao.listar();
		request.setAttribute("listaAluno", lista);
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);	
		}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
