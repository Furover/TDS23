using ASP_NET_CORE_MVC_test.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace ASP_NET_CORE_MVC_test.Controllers
{
    public class DepartmentsController : Controller
{
    public IActionResult Index()
    {
        List<Department> departments = new List<Department>();
        departments.Add(new Department { Id = 1, Name = "Games" });
        departments.Add(new Department { Id = 2, Name = "Consoles" });

        return View(departments);
    }
}
}
