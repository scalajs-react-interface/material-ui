package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Icon",JSImport.Default)
object MuiIconComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiIcon {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
color : OptionalParam[MuiIconColor] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiIconComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiIconComponent.type](
      MuiIconComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiIconC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiIconComponent.type](
      MuiIconComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiIconColor extends js.Object

 object MuiIconColor{
   @inline def INHERIT = "inherit".asInstanceOf[MuiIconColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiIconColor] 
@inline def ACTION = "action".asInstanceOf[MuiIconColor] 
@inline def CONTRAST = "contrast".asInstanceOf[MuiIconColor] 
@inline def DISABLED = "disabled".asInstanceOf[MuiIconColor] 
@inline def ERROR = "error".asInstanceOf[MuiIconColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiIconColor] 
          }



     

         
